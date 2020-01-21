package kg.megacom.transactions.services.common.impl;

import kg.megacom.transactions.services.common.PhoneService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.MANDATORY)
public class PhoneServiceImpl implements PhoneService {
}
