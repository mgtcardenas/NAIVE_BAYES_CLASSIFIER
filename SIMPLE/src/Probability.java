package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Probability
{
	double probability;

	public Probability(String path, Lesson lesson, int examples, int totalExamples, HashSet voc) throws FileNotFoundException
	{
		String[] testWords  = null;
		String   fileString = "";
		File     testFile   = new File(path);
		Scanner  s          = new Scanner(testFile);

		while (s.hasNextLine())
		    fileString += s.nextLine();
		s.close();

		fileString = fileString.toLowerCase();
		testWords  = fileString.split(" ");

		int         numClassificationWords = 0;
		Set<String> otherKeys              = lesson.words.keySet();
		for (String otherKey : otherKeys)
			numClassificationWords += lesson.words.get(otherKey).intValue();

		double probability = (double) examples / (double) totalExamples; //'p(+/-)'

		for (String w : testWords)
		{
			if   (lesson.words.containsKey(w))
			    probability *= (double) (lesson.words.get(w) + 1) / (double) (numClassificationWords + voc.size());
			else
			    probability *= (double) (0.001                  ) / (double) (numClassificationWords + voc.size());
		}//end for

		this.probability = probability;

	}//end src.Probability - constructor
}//end src.Probability - class