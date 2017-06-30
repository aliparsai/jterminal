/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 15:24:33 GMT 2017
 */

package com.grahamedgecombe.jterminal.vt100;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.grahamedgecombe.jterminal.vt100.AnsiControlSequenceListener;
import com.grahamedgecombe.jterminal.vt100.AnsiControlSequenceParser;
import com.grahamedgecombe.jterminal.vt100.TestAnsiControlSequenceParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnsiControlSequenceParser_ESTest extends AnsiControlSequenceParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestAnsiControlSequenceParser testAnsiControlSequenceParser0 = new TestAnsiControlSequenceParser();
      AnsiControlSequenceParser ansiControlSequenceParser0 = new AnsiControlSequenceParser(testAnsiControlSequenceParser0);
      // Undeclared exception!
      try { 
        ansiControlSequenceParser0.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TestAnsiControlSequenceParser testAnsiControlSequenceParser0 = new TestAnsiControlSequenceParser();
      AnsiControlSequenceParser ansiControlSequenceParser0 = new AnsiControlSequenceParser(testAnsiControlSequenceParser0);
      ansiControlSequenceParser0.parse("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AnsiControlSequenceParser ansiControlSequenceParser0 = new AnsiControlSequenceParser((AnsiControlSequenceListener) null);
      // Undeclared exception!
      try { 
        ansiControlSequenceParser0.parse("sXH0I{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.grahamedgecombe.jterminal.vt100.AnsiControlSequenceParser", e);
      }
  }
}