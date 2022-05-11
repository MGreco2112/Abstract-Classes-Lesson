
# Abstract Classes Lesson

A demonstration to Cohort 12 of CareerDevs at to what exactly an
Abstract Java Class is and how it operates




## Lesson Details

### The Abstract Class

In this demonstration of Abstract Classes, the Abstract Class was defined
as a Cat, as there exist many animals that fit the classification
of a Cat yet no animal that is singularly, exactly a Cat.

The Elements of a Cat:

- name
- color
- weight in grams
- is neutered
- species
- meow sound

Each Cat will have these elements. The system will also be able to 
convert the Cat's weight from Grams to Pounds and allows the pet to be
neutered. These elements make up the basis of a cat, thus can be built into
an Abstract Class, which cannot itself be instanciated, but can pass its traits to
other children Classes.

### The Child Class

In this demonstration the class decided the type of Cat to be built as a Child Class
was a House Cat. None of the elements differ in any way from the Parent Class, however the
`meow` element is customized and thus is modified through the abstract method that was
built inside of the Parent Class. The class chose to have the House Cat's meow be `"arf"`.
All other elements are passed into the parent constructor through
a `super()` call.

### The Main Class

In the Main Class, within the `private static void main(String args[])` method, a specific HouseCat
is instanciated, once called Garfield by the class. Garfield was given the name
"Garfield", a color "Orange", a weight of 2500 Grams, he was not neutered, and his breed
was chosen to be a "Persian Tabby".