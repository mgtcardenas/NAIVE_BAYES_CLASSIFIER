SNBC Stands for Simple Naive Bayes Classifier. It is a simple program that reads whatever is in Test.txt and predicts whether it is a positive or a negative review.This program is was a consequence of the video "Text Classification Using Naive Bayes" in YouTube by Francisco Iacobell. Here is a link to that video: https://www.youtube.com/watch?v=EGKeC2S44Rs&t=8s&index=2&list=PL0i267419JcNv1ecCMoK7Zxx_O0sXfx5V

Here is a small glossary of this program:

Classificator: Also known as this program.
Example: Each instance of a unit with which the classificator is trained.
Kin: Also known as a classification, in this program 'positive' and 'negative' would be the kins. This name was chosen for its small size and for the sake of convenience.
In order for the classifier to work, we need the following elements (the ingredients):

The total number of examples overall, i.e., no matter the kin [e]
The total number of examples for each kin. [n]
The total number of times a single word occurs in each kin overall. That means: If 'the' appears in 5 examples of the positive case, then this is the number that what we want. [nk]
The size of the vocabulary [v]
Some notes before describing the procedure: This program was mainly sectioned in two classes, Lesson.java and Probability.java. A Lesson Object holds information about one kin. A Probability Object holds the probability that the Test.txt is of any kin. What Leson.java does is:

Get the number of examples of each kin, aka [n].
Get the kin specific vocabulary so later we can get the overall learnt vocabulary [v].
Read all the words inside the files in the kin folder and get the number of times each word repeats in that case with a Hash Table. Aka [nk]
What Probability.java does is:

Get the probability that Test.txt belongs to any kin.
An oversimplified flow of the program is as follows:

Create a Lesson Object with each of the kins. Note: After this we already have the v, n, e and nk.
We create a Probability Object to get the probability that Test.txt belongs to any kin.
We compare them and whoever is biggest is our kin prediction.
Please note that the 'Probability of Positive' result was different that the one Iacob got in his video, due to an adjustment I made thanks to his comment in the end of the video about the words that are not part of the vocabulary.