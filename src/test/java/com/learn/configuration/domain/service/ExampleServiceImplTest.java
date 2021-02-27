package com.learn.configuration.domain.service;

import com.learn.Buddy;
import com.learn.MyList;
import com.learn.configuration.domain.dao.ExampleDao;
import com.learn.configuration.domain.dto.SomeDto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class ExampleServiceImplTest {
  public ExampleServiceImplTest() {
  }

  private ExampleDao exampleDaoMock = mock(ExampleDao.class);
  @Autowired
  private ExampleServiceImpl exampleService;

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void doSomethingWhen() {
    when(exampleDaoMock.returnSomething(any())).thenReturn(2);
    exampleService.setExampleDao(exampleDaoMock);
    assertEquals(2, exampleService.returnSomething(new SomeDto("some name", 10)));
  }

  @Test
  public void doSomethingWhenWithMockStatic() {
    try (MockedStatic<ExampleServiceImpl> theMock = Mockito.mockStatic(ExampleServiceImpl.class)) {
      when(exampleDaoMock.returnSomething(any())).thenReturn(2);
      exampleService.setExampleDao(exampleDaoMock);
      theMock.when(() -> ExampleServiceImpl.someStaticMethod("some value")).thenReturn("Dima");
      assertEquals(2, exampleService.returnSomethingWithStaticUsage(new SomeDto("some name", 10)));
    }
  }

  @Test
  public void testArgumentCapture() {
    exampleService.returnSomethingWithStaticUsage(new SomeDto("some name", 10));
  }

  @Test
  public void doSomethingGivenИВВ() {
    given(exampleDaoMock.returnSomething(any())).willReturn(2);
    exampleService.setExampleDao(exampleDaoMock);
    assertEquals(2, exampleService.returnSomething(new SomeDto("some name", 10)));
  }

  @Test
  public void whenSpyingOnList_thenCorrect() {
    List<String> list = new ArrayList<>();
    List<String> spyList = spy(list);

    spyList.add("one");
    spyList.add("two");

    verify(spyList).add("one");
    verify(spyList).add("two");

    assertEquals(2, spyList.size());
  }

  @Test
  public void testAnswer() {
    List list = new LinkedList();
    List spy = spy(list);
//// Will throw java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
//    when(spy.get(0)).thenReturn("java");
//    assertEquals("java", spy.get(0));

    doAnswer(invocation -> "java").when(spy).get(0);
    assertEquals("java", spy.get(0));
  }

  @Test
  public void whenAddCalledVerified() {
    MyList myList = mock(MyList.class);
    doNothing().when(myList).add(isA(Integer.class), isA(String.class));
    myList.add(0, "");

    verify(myList, times(1)).add(0, "");
  }

  @Test
  public void whenAddCalledRealMethodCalled() {
    MyList myList = mock(MyList.class);
    doCallRealMethod().when(myList).add(any(Integer.class), any(String.class));
    myList.add(1, "real");

    verify(myList, times(1)).add(1, "real");
    assertEquals(0, myList.size());
  }

  @Test
  public void lookMomICanMockStaticMethods() {
    assertEquals(Buddy.name(), "John");

    try (MockedStatic<Buddy> theMock = Mockito.mockStatic(Buddy.class)) {
      theMock.when(Buddy::name).thenReturn("Rafael");
      assertEquals(Buddy.name(), "Rafael");
    }

    assertEquals(Buddy.name(), "John");
  }
}