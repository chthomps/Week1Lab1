//A program that averages quiz scores and test scores.
public class GradeAvg {

	public static void main(String[] args) {
		
		//Quiz scores initialized
		double quizScore1 = 85;
		double quizScore2 = 90.5;
		double quizScore3 = 74.5;
		
		//Quiz scores averaged
		double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3)/3;
		
		
		
		//Test scores initialized
		double testScore1 = 82.7;
		double testScore2 = 88.2;
		
		//Test scores averaged
		double testScoreAvg = (testScore1 + testScore2)/2;
		
		
			//Printout of both quiz and test averages
			System.out.println("Quiz Average = " + quizScoreAvg + "%");
			System.out.println("Test Average = " + testScoreAvg + "%");
				

	}

}
