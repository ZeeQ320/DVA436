/**
 */
package behaviourMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bool Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.boolAffectation#isReceivedBool <em>Received Bool</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getboolAffectation()
 * @model
 * @generated
 */
public interface boolAffectation extends Affectation {
	/**
	 * Returns the value of the '<em><b>Received Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Bool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Bool</em>' attribute.
	 * @see #setReceivedBool(boolean)
	 * @see behaviourMM.BehaviourMMPackage#getboolAffectation_ReceivedBool()
	 * @model required="true"
	 * @generated
	 */
	boolean isReceivedBool();

	/**
	 * Sets the value of the '{@link behaviourMM.boolAffectation#isReceivedBool <em>Received Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Bool</em>' attribute.
	 * @see #isReceivedBool()
	 * @generated
	 */
	void setReceivedBool(boolean value);

} // boolAffectation
