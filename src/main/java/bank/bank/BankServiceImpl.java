package bank.bank;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class BankServiceImpl implements BankService {
	private final BankRepository repository;

	@Autowired
	public BankServiceImpl(final BankRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Banka> findAll() {
		return (List<Banka>) repository.findAll();
	}

	@Override
	public Banka save(Banka bank) {
		return repository.save(bank);
	}

	@Override
	public Banka findOne(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
		
	}

	@Override
	public List<Banka> search(Banka bank) {
		String id = "%";
		if(bank.getId() != null)
			id = "" + bank.getId();
		return repository.search(id, bank.getBankCode(), bank.getPib(), bank.getName(), bank.getAddress(), bank.getEmail(), bank.getWeb(), bank.getPhone(), bank.getFax(), bank.getBank());
	}
}