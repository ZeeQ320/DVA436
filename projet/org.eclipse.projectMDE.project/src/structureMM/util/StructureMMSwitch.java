/**
 */
package structureMM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import structureMM.Attribute;
import structureMM.Method;
import structureMM.StructureMMPackage;
import structureMM.boolAttribute;
import structureMM.boolMethod;
import structureMM.charAttribute;
import structureMM.charMethod;
import structureMM.doubleAttribute;
import structureMM.doubleMethod;
import structureMM.intAttribute;
import structureMM.intMethod;
import structureMM.stringAttribute;
import structureMM.stringMethod;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see structureMM.StructureMMPackage
 * @generated
 */
public class StructureMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructureMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMMSwitch() {
		if (modelPackage == null) {
			modelPackage = StructureMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StructureMMPackage.CLASS: {
				structureMM.Class class_ = (structureMM.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.DOUBLE_ATTRIBUTE: {
				doubleAttribute doubleAttribute = (doubleAttribute)theEObject;
				T result = casedoubleAttribute(doubleAttribute);
				if (result == null) result = caseAttribute(doubleAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.STRING_ATTRIBUTE: {
				stringAttribute stringAttribute = (stringAttribute)theEObject;
				T result = casestringAttribute(stringAttribute);
				if (result == null) result = caseAttribute(stringAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.CHAR_ATTRIBUTE: {
				charAttribute charAttribute = (charAttribute)theEObject;
				T result = casecharAttribute(charAttribute);
				if (result == null) result = caseAttribute(charAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.BOOL_ATTRIBUTE: {
				boolAttribute boolAttribute = (boolAttribute)theEObject;
				T result = caseboolAttribute(boolAttribute);
				if (result == null) result = caseAttribute(boolAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.INT_ATTRIBUTE: {
				intAttribute intAttribute = (intAttribute)theEObject;
				T result = caseintAttribute(intAttribute);
				if (result == null) result = caseAttribute(intAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.INT_METHOD: {
				intMethod intMethod = (intMethod)theEObject;
				T result = caseintMethod(intMethod);
				if (result == null) result = caseMethod(intMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.BOOL_METHOD: {
				boolMethod boolMethod = (boolMethod)theEObject;
				T result = caseboolMethod(boolMethod);
				if (result == null) result = caseMethod(boolMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.CHAR_METHOD: {
				charMethod charMethod = (charMethod)theEObject;
				T result = casecharMethod(charMethod);
				if (result == null) result = caseMethod(charMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.STRING_METHOD: {
				stringMethod stringMethod = (stringMethod)theEObject;
				T result = casestringMethod(stringMethod);
				if (result == null) result = caseMethod(stringMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureMMPackage.DOUBLE_METHOD: {
				doubleMethod doubleMethod = (doubleMethod)theEObject;
				T result = casedoubleMethod(doubleMethod);
				if (result == null) result = caseMethod(doubleMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(structureMM.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>double Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>double Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedoubleAttribute(doubleAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>string Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>string Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestringAttribute(stringAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>char Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>char Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecharAttribute(charAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>bool Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>bool Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseboolAttribute(boolAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>int Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>int Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseintAttribute(intAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>int Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>int Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseintMethod(intMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>bool Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>bool Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseboolMethod(boolMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>char Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>char Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecharMethod(charMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>string Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>string Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestringMethod(stringMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>double Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>double Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedoubleMethod(doubleMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StructureMMSwitch
