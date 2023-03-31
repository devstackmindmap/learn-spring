package hellojpa.ex1hellojpa;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.metamodel.Metamodel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Ex1HelloJpaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Ex1HelloJpaApplication.class, args);
		EntityManager em  = new EntityManager() {
			@Override
			public void persist(Object entity) {

			}

			@Override
			public <T> T merge(T entity) {
				return null;
			}

			@Override
			public void remove(Object entity) {

			}

			@Override
			public <T> T find(Class<T> entityClass, Object primaryKey) {
				return null;
			}

			@Override
			public <T> T find(Class<T> entityClass, Object primaryKey, Map<String, Object> properties) {
				return null;
			}

			@Override
			public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode) {
				return null;
			}

			@Override
			public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, Map<String, Object> properties) {
				return null;
			}

			@Override
			public <T> T getReference(Class<T> entityClass, Object primaryKey) {
				return null;
			}

			@Override
			public void flush() {

			}

			@Override
			public void setFlushMode(FlushModeType flushMode) {

			}

			@Override
			public FlushModeType getFlushMode() {
				return null;
			}

			@Override
			public void lock(Object entity, LockModeType lockMode) {

			}

			@Override
			public void lock(Object entity, LockModeType lockMode, Map<String, Object> properties) {

			}

			@Override
			public void refresh(Object entity) {

			}

			@Override
			public void refresh(Object entity, Map<String, Object> properties) {

			}

			@Override
			public void refresh(Object entity, LockModeType lockMode) {

			}

			@Override
			public void refresh(Object entity, LockModeType lockMode, Map<String, Object> properties) {

			}

			@Override
			public void clear() {

			}

			@Override
			public void detach(Object entity) {

			}

			@Override
			public boolean contains(Object entity) {
				return false;
			}

			@Override
			public LockModeType getLockMode(Object entity) {
				return null;
			}

			@Override
			public void setProperty(String propertyName, Object value) {

			}

			@Override
			public Map<String, Object> getProperties() {
				return null;
			}

			@Override
			public Query createQuery(String qlString) {
				return null;
			}

			@Override
			public <T> TypedQuery<T> createQuery(CriteriaQuery<T> criteriaQuery) {
				return null;
			}

			@Override
			public Query createQuery(CriteriaUpdate updateQuery) {
				return null;
			}

			@Override
			public Query createQuery(CriteriaDelete deleteQuery) {
				return null;
			}

			@Override
			public <T> TypedQuery<T> createQuery(String qlString, Class<T> resultClass) {
				return null;
			}

			@Override
			public Query createNamedQuery(String name) {
				return null;
			}

			@Override
			public <T> TypedQuery<T> createNamedQuery(String name, Class<T> resultClass) {
				return null;
			}

			@Override
			public Query createNativeQuery(String sqlString) {
				return null;
			}

			@Override
			public Query createNativeQuery(String sqlString, Class resultClass) {
				return null;
			}

			@Override
			public Query createNativeQuery(String sqlString, String resultSetMapping) {
				return null;
			}

			@Override
			public StoredProcedureQuery createNamedStoredProcedureQuery(String name) {
				return null;
			}

			@Override
			public StoredProcedureQuery createStoredProcedureQuery(String procedureName) {
				return null;
			}

			@Override
			public StoredProcedureQuery createStoredProcedureQuery(String procedureName, Class... resultClasses) {
				return null;
			}

			@Override
			public StoredProcedureQuery createStoredProcedureQuery(String procedureName, String... resultSetMappings) {
				return null;
			}

			@Override
			public void joinTransaction() {

			}

			@Override
			public boolean isJoinedToTransaction() {
				return false;
			}

			@Override
			public <T> T unwrap(Class<T> cls) {
				return null;
			}

			@Override
			public Object getDelegate() {
				return null;
			}

			@Override
			public void close() {

			}

			@Override
			public boolean isOpen() {
				return false;
			}

			@Override
			public EntityTransaction getTransaction() {
				return null;
			}

			@Override
			public EntityManagerFactory getEntityManagerFactory() {
				return null;
			}

			@Override
			public CriteriaBuilder getCriteriaBuilder() {
				return null;
			}

			@Override
			public Metamodel getMetamodel() {
				return null;
			}

			@Override
			public <T> EntityGraph<T> createEntityGraph(Class<T> rootType) {
				return null;
			}

			@Override
			public EntityGraph<?> createEntityGraph(String graphName) {
				return null;
			}

			@Override
			public EntityGraph<?> getEntityGraph(String graphName) {
				return null;
			}

			@Override
			public <T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> entityClass) {
				return null;
			}
		};
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Member member = new Member();
		member.setId(1L);
		member.setName("Kim");
		tx.commit();
		em.persist(member);
		em.close();


	}
}
