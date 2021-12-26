# Todoist
---

## [Github Link](https://github.com/gauravkharel/DMA_TodoApp.git) ##

<h2 align="center">
  Todoist: Todo App for the DMA Component 2. 
</h2>


---

#  `MVMM`

## Implemented Features

#1 Sign Up          
---
![](signUp.gif) 

---

#2 Login
---
![](login.gif)

---

#3 Add Task
---
![](addTask.gif)

---

#4 Update Task
---
![](updateTask.gif)

---

#5 Delete Task
---
![](deleteTask.gif)

---

#6 Calender Integration
---
![](calendarView.jpg)

---


#7 Navigation Menu
---
![](navigationMenu.gif)

---

#8 Toggle Menu
---
![](toggleMenu.gif)

---
---

---

# `App Usage`
### ***1 Sign Up:*** By providing essentials credentianls, register as a user to the app.
### ***2 Login:*** Log in with the credentials used while Sign Up.
##### ***3 Todo List:*** Click the (+) icon to add new task. You can input the Task Name and Date to completion.

#### ***4 Update Tasks:*** Click the todo item to edit the task as required. 
#### ***5 Delete the todo items and list:*** Delete the finished task by swiping the task widget to left/right.
#### ***6 Logout :*** Logout from the toggle menu using Logout button. 
#### ***7 More Info/Contact Details :*** From toggle, go to More where you find About App and Contact Details by toggling the menu.  

---
---

# `Design Architecture of app`
# MODEL
* `adapter`  consists of recyclerviews adapters.<br>
-`TasksAdapter` <br>
-`TabsAdapter` <br>



* `Database` consists of dao(class for room database) ,UserAuthentication,db..<br>
-`DataAccessObject`<br>
-`AppDatabase`<br>
-`DateConvert`<br>
-`UserDatabase`<br>


-`TodoListsTasks`<br>


# VIEW
* `Activity`  consists of main activity<br>
-`MainActivity` <br>
-`RegsterActivity` <br>
-`LoginActivity` <br>
-`TabsActivity` <br>
* `Fragments` consists of all fragments<br>
-`AboutFragments`<br>
-`ContactFragments`<br>


# ViewModel
* `MainActivityVieModel`  <br>


---
---


# `References`
## `Resources used to create this App`

[Room persistance library](https://developer.android.com/topic/libraries/architecture/room) <br>
[Paint class holds the style and color information about how to draw geometries, text and bitmaps](https://developer.android.com/reference/android/graphics/Paint) <br>
[LayoutInflater](https://developer.android.com/reference/android/view/LayoutInflater) <br>
[Handling Lifecycles with Lifecycle-Aware Components](https://developer.android.com/topic/libraries/architecture/lifecycle) <br>
[Navigation Components](https://developer.android.com/guide/navigation/navigation-getting-started) <br>
[TypeConverter](https://developer.android.com/reference/android/arch/persistence/room/TypeConverter) <br>

---
