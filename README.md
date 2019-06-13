# Songr

A basic web app for Code 401 students to get familiar with the basics of Spring.

Add albums to a database and see them listed on the page.  

## Features

#### Basic routes

     /hello

Displays the typical "Hello World" greeting. 

    capitalize/{your string here}
    
Capitalizes whatever string you put after the /

    /reverse?sentence={your string here}
    
Takes the string you typed in and reverses it.  

#### Album Routes

    /albums
    
See a list of all albums currently in the database.

    /newAlbum
    
Add a new album to the database using the form provided. 


## How to Run

From your command line, run 

   
    ./gradlew bootRun