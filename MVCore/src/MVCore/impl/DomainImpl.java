/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore.impl;

import MVCore.Attribute;
import MVCore.Constraint;
import MVCore.Documentation;
import MVCore.Domain;
import MVCore.MVCorePackage;

import MVCore.Reference;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MVCore.impl.DomainImpl#getSearchable <em>Searchable</em>}</li>
 *   <li>{@link MVCore.impl.DomainImpl#getLoggable <em>Loggable</em>}</li>
 *   <li>{@link MVCore.impl.DomainImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link MVCore.impl.DomainImpl#getReferences <em>References</em>}</li>
 *   <li>{@link MVCore.impl.DomainImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link MVCore.impl.DomainImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link MVCore.impl.DomainImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends MVCoreClassImpl implements Domain {
	/**
	 * The default value of the '{@link #getSearchable() <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchable()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCHABLE_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getSearchable() <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchable()
	 * @generated
	 * @ordered
	 */
	protected String searchable = SEARCHABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoggable() <em>Loggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggable()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGGABLE_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getLoggable() <em>Loggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggable()
	 * @generated
	 * @ordered
	 */
	protected String loggable = LOGGABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected Domain super_;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MVCorePackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearchable() {
		return searchable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchable(String newSearchable) {
		String oldSearchable = searchable;
		searchable = newSearchable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MVCorePackage.DOMAIN__SEARCHABLE, oldSearchable, searchable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoggable() {
		return loggable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoggable(String newLoggable) {
		String oldLoggable = loggable;
		loggable = newLoggable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MVCorePackage.DOMAIN__LOGGABLE, oldLoggable, loggable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, MVCorePackage.DOMAIN__ATTRIBUTES, MVCorePackage.ATTRIBUTE__DOMAIN);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentWithInverseEList<Reference>(Reference.class, this, MVCorePackage.DOMAIN__REFERENCES, MVCorePackage.REFERENCE__SRC);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (Domain)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MVCorePackage.DOMAIN__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(Domain newSuper) {
		Domain oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MVCorePackage.DOMAIN__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, MVCorePackage.DOMAIN__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this, MVCorePackage.DOMAIN__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MVCorePackage.DOMAIN__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case MVCorePackage.DOMAIN__REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferences()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MVCorePackage.DOMAIN__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case MVCorePackage.DOMAIN__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case MVCorePackage.DOMAIN__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case MVCorePackage.DOMAIN__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
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
			case MVCorePackage.DOMAIN__SEARCHABLE:
				return getSearchable();
			case MVCorePackage.DOMAIN__LOGGABLE:
				return getLoggable();
			case MVCorePackage.DOMAIN__ATTRIBUTES:
				return getAttributes();
			case MVCorePackage.DOMAIN__REFERENCES:
				return getReferences();
			case MVCorePackage.DOMAIN__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
			case MVCorePackage.DOMAIN__CONSTRAINTS:
				return getConstraints();
			case MVCorePackage.DOMAIN__DOCUMENTATION:
				return getDocumentation();
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
			case MVCorePackage.DOMAIN__SEARCHABLE:
				setSearchable((String)newValue);
				return;
			case MVCorePackage.DOMAIN__LOGGABLE:
				setLoggable((String)newValue);
				return;
			case MVCorePackage.DOMAIN__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case MVCorePackage.DOMAIN__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case MVCorePackage.DOMAIN__SUPER:
				setSuper((Domain)newValue);
				return;
			case MVCorePackage.DOMAIN__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case MVCorePackage.DOMAIN__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
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
			case MVCorePackage.DOMAIN__SEARCHABLE:
				setSearchable(SEARCHABLE_EDEFAULT);
				return;
			case MVCorePackage.DOMAIN__LOGGABLE:
				setLoggable(LOGGABLE_EDEFAULT);
				return;
			case MVCorePackage.DOMAIN__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MVCorePackage.DOMAIN__REFERENCES:
				getReferences().clear();
				return;
			case MVCorePackage.DOMAIN__SUPER:
				setSuper((Domain)null);
				return;
			case MVCorePackage.DOMAIN__CONSTRAINTS:
				getConstraints().clear();
				return;
			case MVCorePackage.DOMAIN__DOCUMENTATION:
				getDocumentation().clear();
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
			case MVCorePackage.DOMAIN__SEARCHABLE:
				return SEARCHABLE_EDEFAULT == null ? searchable != null : !SEARCHABLE_EDEFAULT.equals(searchable);
			case MVCorePackage.DOMAIN__LOGGABLE:
				return LOGGABLE_EDEFAULT == null ? loggable != null : !LOGGABLE_EDEFAULT.equals(loggable);
			case MVCorePackage.DOMAIN__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case MVCorePackage.DOMAIN__REFERENCES:
				return references != null && !references.isEmpty();
			case MVCorePackage.DOMAIN__SUPER:
				return super_ != null;
			case MVCorePackage.DOMAIN__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case MVCorePackage.DOMAIN__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
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
		result.append(" (Searchable: ");
		result.append(searchable);
		result.append(", Loggable: ");
		result.append(loggable);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
