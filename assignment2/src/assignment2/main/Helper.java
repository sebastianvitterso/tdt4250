package assignment2.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
	
	public Collection<Course> getOpenSlotCourses(Semester semester) {
		EList<OpenSlot> slots = semester.getOpenSlots();

		Collection<Field> acceptedFields = new java.util.ArrayList<Field>();
		Collection<Field> allFields = Arrays.asList(Field.values()); 
		for (OpenSlot openSlot : slots) {
			if (openSlot.isFromField()) {
				acceptedFields.addAll(openSlot.getFields());
			} else {
				acceptedFields.addAll(
					allFields.stream()
						.filter(fld -> !openSlot.getFields().contains(fld))
						.collect(Collectors.toList())
				);
			}
		}
		
		Collection<Course> courses = new java.util.ArrayList<Course>();
		
		EList<Course> allCourses = semester.getInProgramme().getInUniversity().getCourses();
		
		for (Course course : allCourses) {
			if(acceptedFields.contains(course.getField())) {
				courses.add(course);
			}
		}
		
		return courses;
	}
}
