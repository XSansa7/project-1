# Pre-work - **ToDoApp**

**ToDoApp** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Xiansha Jin**

Time spent: **4** hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!
## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://imgur.com/a/G1Fv3' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** I feel that Android app development platform is easy to use so far. I don’t have much experience using other platforms, so I also learned to develop some simple app in iOS with help of online tutorials and documentation. From the perspective of a beginner to both Android and iOS, Android’s approach to layouts and user interfaces is quite nicer for me. To build a UI or control properties of contained views, I can either use Layout Editor or code in XML files. The Layout Editor makes the process easy to begin, using XML vocabulary guarantees a clear and precise arrangement of UI elements. In iOS, Storyboard is a main approach to build a UI, and programmatically creating layouts could be difficult and bug-prone. RelativeLayout in Android enables specifying the locations of child objects to each other or to the parent, which helps design flexible UI. The analogy to RelativeLayout in iOS is Auto Layout, which seems powerful yet complex.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** An adapter converts each data object to a corresponding view item contained in an AdapterView. In our pre-work, the ListView is an AdapterView, by attaching it with an ArrayAdapter, the ListView is associated with a list of String to represent in it. The importance of the adapter resides in that it provides a method to control views’ behavior and display/modify data on the screen.

The ArrayAdapter calls getView on each data object to create views for the ListView to fill its rows. As the user scroll down, some views created before are no longer being displayed, then the convertView is one existing view recycled to display new data.


## Notes

There aren’t many challenges encountered in implementing the required functionality. One bug caused by null error was dismissed since running the app on Genymotion doesn’t show any sign of it until I tested the app on the standard Android Emulator. I spent more hours to make android concepts clear and learn the basics of iOS development so that I can compare Android and iOS. 

## License

    Copyright 2017 Xiansha Jin

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
