package se.magos.service;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import se.magos.domain.Account;

@Stateful
public class AccountService {

	@PersistenceContext(name = "persistence/em", unitName = "foo")
	private EntityManager em;

	public AccountService() {
		System.out.println("AccountService - EntityManger is null? "
				+ (em == null));
	}

	public AccountService(EntityManager em) {
		this.em = em;
	}

	public void create(Account account) {
		System.out.println("AccountService - About to persist account: "
				+ account.toString());
		em.persist(account);
	}

	public Account read(long id) {
		Account account = em.find(Account.class, id);
		return account;
	}

	public List<Account> readAll() {
		CriteriaBuilder qb = em.getCriteriaBuilder();
		CriteriaQuery<Account> c = qb.createQuery(Account.class);
		TypedQuery<Account> q = em.createQuery(c);

		return q.getResultList();
	}

	public void update(Account account) {
		em.persist(account);
	}

	public void delete(Account account) {
		em.remove(account);
	}
}
