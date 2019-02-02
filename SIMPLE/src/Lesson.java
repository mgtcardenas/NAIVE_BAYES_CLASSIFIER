package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Lesson
{
	int                        numExamples;
	HashSet<String>            vocabulary;
	Hashtable<String, Integer> words;

	public Lesson(String filePath) throws FileNotFoundException
	{
		vocabulary = new HashSet<>  ();
		words      = new Hashtable<>();
		String[] exampleWords = null;
		String   fileString   = "";
		File     dir          = new File(filePath);

		for (File file : dir.listFiles())
		{
			numExamples++;
			Scanner s = new Scanner(file);
			while (s.hasNextLine())
				fileString += s.nextLine();

			s.close();

			fileString   = fileString.toLowerCase();
			exampleWords = fileString.split(" ");
			fileString   = "";

			for (String w : exampleWords)
			{
				vocabulary.add(w);
				if (words.containsKey(w))
					words.put(w, words.get(w) + 1);
				else
					words.put(w, 1);
			}//end for

		}//end for each
	}//end src.Lesson - src.Lesson
}//end src.Lesson - class