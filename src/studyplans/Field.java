/**
 */
package studyplans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Field</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see studyplans.StudyplansPackage#getField()
 * @model
 * @generated
 */
public enum Field implements Enumerator {
	/**
	 * The '<em><b>It</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IT_VALUE
	 * @generated
	 * @ordered
	 */
	IT(0, "it", "it"),

	/**
	 * The '<em><b>El</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EL_VALUE
	 * @generated
	 * @ordered
	 */
	EL(1, "el", "el"),

	/**
	 * The '<em><b>Math</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATH_VALUE
	 * @generated
	 * @ordered
	 */
	MATH(2, "math", "math"),

	/**
	 * The '<em><b>Philosophy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHILOSOPHY_VALUE
	 * @generated
	 * @ordered
	 */
	PHILOSOPHY(3, "philosophy", "philosophy");

	/**
	 * The '<em><b>It</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IT
	 * @model name="it"
	 * @generated
	 * @ordered
	 */
	public static final int IT_VALUE = 0;

	/**
	 * The '<em><b>El</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EL
	 * @model name="el"
	 * @generated
	 * @ordered
	 */
	public static final int EL_VALUE = 1;

	/**
	 * The '<em><b>Math</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATH
	 * @model name="math"
	 * @generated
	 * @ordered
	 */
	public static final int MATH_VALUE = 2;

	/**
	 * The '<em><b>Philosophy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHILOSOPHY
	 * @model name="philosophy"
	 * @generated
	 * @ordered
	 */
	public static final int PHILOSOPHY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Field[] VALUES_ARRAY =
		new Field[] {
			IT,
			EL,
			MATH,
			PHILOSOPHY,
		};

	/**
	 * A public read-only list of all the '<em><b>Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Field> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Field</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Field get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Field result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Field</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Field getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Field result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Field</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Field get(int value) {
		switch (value) {
			case IT_VALUE: return IT;
			case EL_VALUE: return EL;
			case MATH_VALUE: return MATH;
			case PHILOSOPHY_VALUE: return PHILOSOPHY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Field(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Field
