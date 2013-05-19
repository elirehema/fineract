/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.accounting.rule.data;

import java.util.ArrayList;
import java.util.List;

import org.mifosplatform.accounting.glaccount.data.GLAccountData;
import org.mifosplatform.organisation.office.data.OfficeData;

/**
 * Immutable object representing a General Ledger Account
 * 
 * Note: no getter/setters required as google-gson will produce json from fields
 * of object.
 */
public class AccountingRuleData {

	private final Long id;
	private final Long officeId;
	private final String officeName;
	private final Long accountToDebitId;
	private final Long accountToCreditId;
	private final String name;
	private final String description;
	private final boolean systemDefined;
	private final String debitAccountName;
	private final String creditAccountName;
	private final String debitAccountGLCode;
	private final String creditAccountGLCode;

	// template
	@SuppressWarnings("unused")
	private List<OfficeData> allowedOffices = new ArrayList<OfficeData>();
	@SuppressWarnings("unused")
	private List<GLAccountData> allowedAccounts = new ArrayList<GLAccountData>();

	public AccountingRuleData(final Long id, final Long accountToDebitId, final Long accountToCreditId) {
		this(id, null, null, accountToDebitId, accountToCreditId, null, null, true, null, null, null, null, null, null);
	}

	public AccountingRuleData(final Long id, final Long officeId, final String officeName, final Long accountToDebitId,
			final Long accountToCreditId, final String name, final String description, final boolean systemDefined,
			final String debitAccountName, final String creditAccountName, final String debitAccountGLCode,
			final String creditAccountGLCode) {
		this(id, officeId, officeName, accountToDebitId, accountToCreditId, name, description, systemDefined, debitAccountName,
				creditAccountName, debitAccountGLCode, creditAccountGLCode, null, null);
	}

	public AccountingRuleData(final Long id, final Long officeId, final String officeName, final Long accountToDebitId,
			final Long accountToCreditId, final String name, final String description, final boolean systemDefined,
			final String debitAccountName, final String creditAccountName, final String debitAccountGLCode,
			final String creditAccountGLCode, final List<OfficeData> allowedOffices, final List<GLAccountData> allowedAccounts) {
		this.id = id;
		this.officeId = officeId;
		this.officeName = officeName;
		this.accountToDebitId = accountToDebitId;
		this.accountToCreditId = accountToCreditId;
		this.name = name;
		this.description = description;
		this.systemDefined = systemDefined;
		this.allowedOffices = allowedOffices;
		this.allowedAccounts = allowedAccounts;
		this.debitAccountName = debitAccountName;
		this.creditAccountName = creditAccountName;
		this.debitAccountGLCode = debitAccountGLCode;
		this.creditAccountGLCode = creditAccountGLCode;
	}

	public AccountingRuleData(final AccountingRuleData accountingRuleData,
			final List<GLAccountData> allowedAccounts, final List<OfficeData> allowedOffices) {
		this.id = accountingRuleData.id;
		this.officeId = accountingRuleData.officeId;
		this.officeName = accountingRuleData.officeName;
		this.accountToDebitId = accountingRuleData.accountToDebitId;
		this.accountToCreditId = accountingRuleData.accountToCreditId;
		this.name = accountingRuleData.name;
		this.description = accountingRuleData.description;
		this.systemDefined = accountingRuleData.systemDefined;
		this.allowedOffices = allowedOffices;
		this.allowedAccounts = allowedAccounts;
		this.debitAccountName = accountingRuleData.debitAccountName;
		this.creditAccountName = accountingRuleData.creditAccountName;
		this.debitAccountGLCode = accountingRuleData.debitAccountGLCode;
		this.creditAccountGLCode = accountingRuleData.creditAccountGLCode;
	}

	public AccountingRuleData(final List<GLAccountData> allowedAccounts, final List<OfficeData> allowedOffices) {
		this.id = null;
		this.officeId = null;
		this.officeName = null;
		this.accountToDebitId = null;
		this.accountToCreditId = null;
		this.name = null;
		this.description = null;
		this.systemDefined = false;
		this.allowedOffices = allowedOffices;
		this.allowedAccounts = allowedAccounts;
		this.debitAccountName = null;
		this.creditAccountName = null;
		this.debitAccountGLCode = null;
		this.creditAccountGLCode = null;
	}
}