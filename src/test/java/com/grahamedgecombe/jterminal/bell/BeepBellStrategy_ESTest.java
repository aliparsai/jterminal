/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 15:29:18 GMT 2017
 */

package com.grahamedgecombe.jterminal.bell;

import org.junit.Test;
import static org.junit.Assert.*;
import com.grahamedgecombe.jterminal.bell.BeepBellStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BeepBellStrategy_ESTest extends BeepBellStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BeepBellStrategy beepBellStrategy0 = new BeepBellStrategy();
      beepBellStrategy0.soundBell();
  }
}