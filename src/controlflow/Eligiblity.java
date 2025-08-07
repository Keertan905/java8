package controlflow;

//Design an application for student eligibility check for placement criteria
//if students acedamically having through out (10,12,B.tech) 60% then only allowed for campus placement
public class Eligiblity {
	/**
	 * if tenth >= 60 then if twelth >=60 then if bTech >=60 return true else return
	 * false
	 * 
	 * @param tenth
	 * @param twelth
	 * @param bTech
	 * @return
	 */
	public static boolean isEligible(double tenth, double twelth, double bTech) {
		if (tenth >= 60) {
			if (twelth >= 60) {
				if (bTech >= 60) {
					return true;

				} else {
					return false;
				}

			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
