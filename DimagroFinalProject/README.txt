A TreeMap was used to store the applicants. One of the main reasons for choosing this data structure was how it offers <key, value>.
Since the user name of the applicant is unique i can easily get the applicant object information based of this. Secondly since
I don't know the amount of data item i'm going to have I don't have to define it. Finally the methods, get and contains key both have 
big o of log n which is the most practical out of all the other data structures.

A TreeSet was used to store the applicant objects that were sent to the waiting list. The Applicant class implements comparable AI
score which is ordered in the TreeSet. The biggest AI score goes to the top of the waiting list and also has big o of log n.

A Hash set was used to store all the words of the dictionary. This is because we have a known amount of data items inside the dictionary.txt
file. Methods get, contains, and, next all have big o of 1 inside the Hash set. When searching from words inside the applicant
essay to the dictionary using the contains method makes this the best data structure to hold all these words.