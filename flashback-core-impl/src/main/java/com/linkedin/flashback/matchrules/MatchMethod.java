/*
 * Copyright (c) LinkedIn Corporation. All rights reserved. Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */

package com.linkedin.flashback.matchrules;

import com.linkedin.flashback.serializable.RecordedHttpRequest;


/**
 * Match rule to match http method
 * @author shfeng
 */
public class MatchMethod extends BaseMatchRule {
  @Override
  public boolean test(RecordedHttpRequest incomingRequest, RecordedHttpRequest expectedRequest) {
    return incomingRequest.getMethod().equals(expectedRequest.getMethod());
  }

  @Override
  public String getMatchFailureDescriptionForRequests(RecordedHttpRequest incomingRequest, RecordedHttpRequest expectedRequest) {
    return String.format("HTTP Method Mismatch%nIncoming Method: %s%nExpected Method: %s%n",
        incomingRequest.getMethod(),
        expectedRequest.getMethod());
  }
}
