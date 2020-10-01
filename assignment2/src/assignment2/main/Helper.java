package assignment2.main;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.ocl.ecore.OrderedSetType;

import studyplans.Course;
import studyplans.Field;
import studyplans.OpenSlot;
import studyplans.Semester;
import studyplans.StudyplansPackage;
import studyplans.University;

public class Helper {
	
	public String repeatString(String str, int num) {
		return str.repeat(num);
	}
	
	public EList<Course> getOpenSlotCourses(Semester semester) {
		EList<OpenSlot> slots = semester.getOpenSlots();

		EList<Field> acceptedFields = new EObjectContainmentEList<Field>(Field.class, null, StudyplansPackage.FIELD);
		
		for (OpenSlot openSlot : slots) {
			acceptedFields.addAll(openSlot.getFields());
		}
		
		
		EList<Course> courses = new EObjectContainmentEList<Course>(Course.class, null, StudyplansPackage.COURSE);
		
		EList<Course> allCourses = semester.getInProgramme().getInUniversity().getCourses();
		
		for (Course course : allCourses) {
			if(acceptedFields.contains(course.getField())) {
				courses.add(course);
			}
		}
		
		
		return courses;
	}
}
