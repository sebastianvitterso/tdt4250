/**
 */
package import_.impl;

import import_.ImportPackage;
import import_.Quay;
import import_.StopPlace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link import_.impl.StopPlaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link import_.impl.StopPlaceImpl#getQuays <em>Quays</em>}</li>
 *   <li>{@link import_.impl.StopPlaceImpl#getNeighbours <em>Neighbours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopPlaceImpl extends MinimalEObjectImpl.Container implements StopPlace {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuays() <em>Quays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuays()
	 * @generated
	 * @ordered
	 */
	protected EList<Quay> quays;

	/**
	 * The cached value of the '{@link #getNeighbours() <em>Neighbours</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbours()
	 * @generated
	 * @ordered
	 */
	protected EList<StopPlace> neighbours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportPackage.Literals.STOP_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.STOP_PLACE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quay> getQuays() {
		if (quays == null) {
			quays = new EObjectContainmentEList<Quay>(Quay.class, this, ImportPackage.STOP_PLACE__QUAYS);
		}
		return quays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopPlace> getNeighbours() {
		if (neighbours == null) {
			neighbours = new EObjectResolvingEList<StopPlace>(StopPlace.class, this, ImportPackage.STOP_PLACE__NEIGHBOURS);
		}
		return neighbours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImportPackage.STOP_PLACE__QUAYS:
				return ((InternalEList<?>)getQuays()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImportPackage.STOP_PLACE__ID:
				return getId();
			case ImportPackage.STOP_PLACE__QUAYS:
				return getQuays();
			case ImportPackage.STOP_PLACE__NEIGHBOURS:
				return getNeighbours();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImportPackage.STOP_PLACE__ID:
				setId((String)newValue);
				return;
			case ImportPackage.STOP_PLACE__QUAYS:
				getQuays().clear();
				getQuays().addAll((Collection<? extends Quay>)newValue);
				return;
			case ImportPackage.STOP_PLACE__NEIGHBOURS:
				getNeighbours().clear();
				getNeighbours().addAll((Collection<? extends StopPlace>)newValue);
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
			case ImportPackage.STOP_PLACE__ID:
				setId(ID_EDEFAULT);
				return;
			case ImportPackage.STOP_PLACE__QUAYS:
				getQuays().clear();
				return;
			case ImportPackage.STOP_PLACE__NEIGHBOURS:
				getNeighbours().clear();
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
			case ImportPackage.STOP_PLACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ImportPackage.STOP_PLACE__QUAYS:
				return quays != null && !quays.isEmpty();
			case ImportPackage.STOP_PLACE__NEIGHBOURS:
				return neighbours != null && !neighbours.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //StopPlaceImpl
