package practice14.ptra14;
import practice14.common.Course;

public class JavaCourse implements Course{
	String name;
	public String getCourseName() {
		return name;
	}
	String[] a = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
	public String[] getCourseUnit() {
		return a;
	}
}
