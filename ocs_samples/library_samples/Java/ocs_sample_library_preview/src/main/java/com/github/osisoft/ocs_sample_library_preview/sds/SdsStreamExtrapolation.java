/** SdsStreamExtrapolation.java
 * 
 *  Copyright 2019 OSIsoft, LLC
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0>
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package  com.github.osisoft.ocs_sample_library_preview.sds;

/** 
 * SdsStreamExtrapolation 0-3
 */
public enum SdsStreamExtrapolation {

    All(0),
    None(1),
    Forward(2),
    Backward(3);

    private final int SdsStreamExtrapolation;

    private SdsStreamExtrapolation(int id) {
        this.SdsStreamExtrapolation = id;
    }

    /**
     * gets the value
     * @return
     */
    int getValue() {
        return SdsStreamExtrapolation;
    }
}
