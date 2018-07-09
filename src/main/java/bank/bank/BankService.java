package bank.bank;

import java.util.List;

public interface BankService {
	public List<Banka> findAll();

	public Banka save(Banka bank);

	public Banka findOne(Long id);
	
	public void delete(Long id);
	
	public List<Banka> search(Banka bank);
}
