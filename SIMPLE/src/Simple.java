package src;

import java.io.FileNotFoundException;
import java.util.HashSet;

public class Simple
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int             totalNumExamples;
		Lesson          positive;
		Lesson          negative;
		Probability     probPositive;
		Probability     probNegative;
		HashSet<String> vocabulary;

		positive         = new Lesson("SIMPLE/res/POSITIVE_REVIEWS");
		negative         = new Lesson("SIMPLE/res/NEGATIVE_REVIEWS");
		totalNumExamples = positive.numExamples + negative.numExamples;
		vocabulary       = new HashSet<>();

		vocabulary.addAll(positive.vocabulary);
		vocabulary.addAll(negative.vocabulary);

		probPositive = new Probability("SIMPLE/res/test.txt", positive, positive.numExamples, totalNumExamples, vocabulary);
		probNegative = new Probability("SIMPLE/res/test.txt", negative, negative.numExamples, totalNumExamples, vocabulary);

		System.out.println("Probability of Positive: " + probPositive.probability);
		System.out.println("Probability of Negative: " + probNegative.probability);

		if   (probPositive.probability > probNegative.probability)
		    System.out.println("I would say this is positive");
		else
		    System.out.println("I would say this is negative");

	}//end main
}//end src.Simple - class