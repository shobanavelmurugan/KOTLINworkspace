package mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.constructoroverloading


/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 24/9/19 for KOTLINworkspace
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
class SquareShape {
    var mSide:Double=0.0
    constructor(side:Double){
        mSide=side
    }

    fun areaofSquare(){
        val area=mSide*mSide
        println("Area of Square $area")
    }
}