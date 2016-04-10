package Brain;

import Language.Consonant;

public class WernickeArea implements Consonant{
	//베르니케 영역(정보의 입력을 담당)
	@Override
	public String Consonant() {
		 String consonant = "ㄱ,ㄴ,ㄷ,ㄹ,ㅁ,ㅂ,ㅅ,ㅇ,ㅈ,ㅊ,ㅋ,ㅌ,ㅍ,ㅎ";
		 return consonant;
	}
}
