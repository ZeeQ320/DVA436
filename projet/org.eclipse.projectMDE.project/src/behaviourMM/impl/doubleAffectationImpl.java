/**
 */
package behaviourMM.impl;

import behaviourMM.BehaviourMMPackage;
import behaviourMM.doubleAffectation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>double Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.impl.doubleAffectationImpl#getReceivedDouble <em>Received Double</em>}</li>
 * </ul>
 *
 * @generated
 */
public class doubleAffectationImpl extends AffectationImpl implements doubleAffectation {
	/**
	 * The default value of the '{@link #getReceivedDouble() <em>Received Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDouble()
	 * @generated
	 * @ordered
	 */
	protected static final double RECEIVED_DOUBLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReceivedDouble() <em>Received Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDouble()
	 * @generated
	 * @ordered
	 */
	protected double receivedDouble = RECEIVED_DOUBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected doubleAffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourMMPackage.Literals.DOUBLE_AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReceivedDouble() {
		return receivedDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedDouble(double newReceivedDouble) {
		double oldReceivedDouble = receivedDouble;
		receivedDouble = newReceivedDouble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.DOUBLE_AFFECTATION__RECEIVED_DOUBLE, oldReceivedDouble, receivedDouble));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourMMPackage.DOUBLE_AFFECTATION__RECEIVED_DOUBLE:
				return getReceivedDouble();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourMMPackage.DOUBLE_AFFECTATION__RECEIVED_DOUBLE:
				setReceivedDouble((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviourMMPackage.DOUBLE_AFFECTATION__RECEIVED_DOUBLE:
				setReceivedDouble(RECEIVED_DOUBLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviourMMPackage.DOUBLE_AFFECTATION__RECEIVED_DOUBLE:
				return receivedDouble != RECEIVED_DOUBLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (receivedDouble: ");
		result.append(receivedDouble);
		result.append(')');
		return result.toString();
	}

} //doubleAffectationImpl
