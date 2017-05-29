/**
 */
package behaviourMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.Operator#getElement1 <em>Element1</em>}</li>
 *   <li>{@link behaviourMM.Operator#getElement2 <em>Element2</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Element1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element1</em>' containment reference.
	 * @see #setElement1(Variable)
	 * @see behaviourMM.BehaviourMMPackage#getOperator_Element1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getElement1();

	/**
	 * Sets the value of the '{@link behaviourMM.Operator#getElement1 <em>Element1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element1</em>' containment reference.
	 * @see #getElement1()
	 * @generated
	 */
	void setElement1(Variable value);

	/**
	 * Returns the value of the '<em><b>Element2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element2</em>' containment reference.
	 * @see #setElement2(Variable)
	 * @see behaviourMM.BehaviourMMPackage#getOperator_Element2()
	 * @model containment="true"
	 * @generated
	 */
	Variable getElement2();

	/**
	 * Sets the value of the '{@link behaviourMM.Operator#getElement2 <em>Element2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element2</em>' containment reference.
	 * @see #getElement2()
	 * @generated
	 */
	void setElement2(Variable value);

} // Operator
