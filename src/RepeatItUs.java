
public class RepeatItUs {
	
	public static void main(String[] args) {
		
		String sentence = "copyandpastecopyandpastecopyandpastecopyandpastecopyandpastecopyandpastecommitandpushcommitandpushcommitandpushcommitandpushpushcccccommmitttsss";
		
		//Q1: The total number of characters in the sentence
		int sentenceLength = sentence.length();
		System.out.println("Total number of characters in the sentence : " + sentenceLength);
		
		//Q2: The last 15 characters in the string
		int startIndex = sentenceLength - 15; // To get index of 15th char from end 'string size - 15'
		String last15Char = sentence.substring(startIndex);
		System.out.println("Last 15 Characters in sentence : " + last15Char);		
		
		//Q3 : Number of times p and c repeat in sentence
		int pCount = 0;
		int cCount = 0;
		
		String[] splitSentence = sentence.split("");
		
		for(int i = 0 ; i < splitSentence.length ; i++) {
			
			if(splitSentence[i].equals("c")) {
				cCount++;
			}
			
			if(splitSentence[i].equals("p")) {
				pCount++;
			}
		}
		
		System.out.println("Number of times for c : " + cCount);
		System.out.println("Number of times for p : " + pCount);

	
	}

}
