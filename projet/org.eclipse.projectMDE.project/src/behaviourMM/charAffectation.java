/**
 */
package behaviourMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>char Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.charAffectation#getReceivedChar <em>Received Char</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getcharAffectation()
 * @model
 * @generated
 */
public interface charAffectation extends Affectation {
	/**
	 * Returns the value of the '<em><b>Received Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Char</em>' attribute.
	 * @see #setReceivedChar(char)
	 * @see behaviourMM.BehaviourMMPackage#getcharAffectation_ReceivedChar()
	 * @model required="true"
	 * @generated
	 */
	char getReceivedChar();

	/**
	 * Sets the value of the '{@link behaviourMM.charAffectation#getReceivedChar <em>Received Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Char</em>' attribute.
	 * @see #getReceivedChar()
	 * @generated
	 */
	void setReceivedChar(char value);

} // charAffectation
