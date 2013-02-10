/*
 * Copyright 2012-2013 Cooma Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.metaframe.demo.cooma.car.impl;

import com.metaframe.cooma.Config;
import com.metaframe.demo.cooma.car.Car;
import com.metaframe.demo.cooma.wheel.Wheel;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Jerry Lee(oldratlee<at>gmail<dot>com)
 */
public class CarRunCountWrapper implements Car {
    Car car;
    AtomicInteger counter = new AtomicInteger();

    public CarRunCountWrapper(Car car) {
        this.car = car;
    }

    public void run(Config config) {
        car.run(config);

        counter.incrementAndGet();
        System.out.println("Run time: " + counter);
    }
}
