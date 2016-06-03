/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jetbrains.python.psi.impl.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import com.jetbrains.python.psi.PyFunction;
import com.jetbrains.python.psi.stubs.PyFunctionStub;
import org.jetbrains.annotations.Nullable;

public class PyFunctionStubImpl extends StubBase<PyFunction> implements PyFunctionStub {
  private final String myName;
  private final String myDocString;
  private final StringRef myDeprecationMessage;

  public PyFunctionStubImpl(final String name, final String docString, @Nullable final StringRef deprecationMessage,
                            final StubElement parent, IStubElementType stubElementType) {
    super(parent, stubElementType);
    myName = name;
    myDocString = docString;
    myDeprecationMessage = deprecationMessage;
  }

  public String getName() {
    return myName;
  }

  public String getDocString() {
    return myDocString;
  }

  @Override
  public String getDeprecationMessage() {
    return myDeprecationMessage == null ? null : myDeprecationMessage.getString();
  }

  @Override
  public String toString() {
    return "PyFunctionStub(" + myName + ")";
  }
}