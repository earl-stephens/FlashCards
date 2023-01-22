# FlashCards

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)  
- [Getting Started](#getting-started)  
- [Further Improvements](#further-improvements)  
- [Built With](#built-with)  
- [Authors](#authors)  

## Introduction

This is a Turing School of Software and Design Module 1 project.  The project requirements are located at 
[FlashCards](https://backend.turing.edu/module1/projects/flashcards/).  While this project was designed for Ruby, I have coded it in Java for practice and learning the Java language.

The point of FlashCards is to create a deck of cards that have a question, answer and category.  The user is presented with the question and takes a guess at the answer.  The program outputs Correct! or Incorrect based on the answer.  At the end of the game, the program tells the user the number of correct guesses, and the percent of correct guesses based on the category.

## Installation

Copy the following files:  
Card.java  
Deck.java  
Turn.java  
Round.java   
Flashcard.java  
cards.txt  

At the command line, compile the files (except for cards.txt) as follows:  
`javac -d . filename.java`  

## Getting Started   

Run the program with:  
`java -cp . main.Flashcard`  

## Further Improvements

Some ideas I had for future improvements are:  
- Go from a pop up window interface to a web page interface
- Instead of using a text file of cards, set up a database of cards

## Built With

OpenJDK 16.0.1

JUnit 5  

Eclipse 2020-06

## Authors

[Earl Stephens](https://github.com/earl-stephens)