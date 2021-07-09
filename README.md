# Lab: 08 - OO Design and GSON:

In this lab I used a json file to generate random popular book quotes. a *Books* class has been created in order to make it matching the required data in the Json file. also, to convert the Array in json file to a **List** of type *Books* in order to make it available to be converted from json.

# Lab: 09 - Web requests:

In this lab I garbed quotes from an API and display them to the user, if an error happened to get the data from the API like connection problem; the data from previous JSON file will be displayed. 


## To run this code:

clone repo by the following command: 

```git clone https://github.com/AseelHamamreh/quotes```


add the gson library to your gradle.build file:

```
dependencies {
    implementation 'com.google.code.gson:gson:2.8.7'
}
```

run the code from Intellij or your terminal
