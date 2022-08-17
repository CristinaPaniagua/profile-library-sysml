/**
 */
package org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Device Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfilePackage#getDeviceKind()
 * @model
 * @generated
 */
public enum DeviceKind implements Enumerator {
	/**
	 * The '<em><b>Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	SENSOR(0, "Sensor", "Sensor"),

	/**
	 * The '<em><b>Actuator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTUATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTUATOR(1, "Actuator", "Actuator"),

	/**
	 * The '<em><b>Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION(2, "Communication", "Communication"),

	/**
	 * The '<em><b>X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X_VALUE
	 * @generated
	 * @ordered
	 */
	X(3, "X", "X");

	/**
	 * The '<em><b>Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR
	 * @model name="Sensor"
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_VALUE = 0;

	/**
	 * The '<em><b>Actuator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTUATOR
	 * @model name="Actuator"
	 * @generated
	 * @ordered
	 */
	public static final int ACTUATOR_VALUE = 1;

	/**
	 * The '<em><b>Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION
	 * @model name="Communication"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VALUE = 2;

	/**
	 * The '<em><b>X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X_VALUE = 3;

	/**
	 * An array of all the '<em><b>Device Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceKind[] VALUES_ARRAY =
		new DeviceKind[] {
			SENSOR,
			ACTUATOR,
			COMMUNICATION,
			X,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceKind get(int value) {
		switch (value) {
			case SENSOR_VALUE: return SENSOR;
			case ACTUATOR_VALUE: return ACTUATOR;
			case COMMUNICATION_VALUE: return COMMUNICATION;
			case X_VALUE: return X;
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
	private DeviceKind(int value, String name, String literal) {
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
	
} //DeviceKind
