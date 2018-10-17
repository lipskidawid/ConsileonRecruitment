package consileon.recruitment.ap1;

public class WordsCount  {
	public int wordsCount(String[] words, int len) {
		int counter = 0;
		for(String element : words) {
			if(element.length() == len) {
				counter++;
			}
		}
		return counter;
	}
}
