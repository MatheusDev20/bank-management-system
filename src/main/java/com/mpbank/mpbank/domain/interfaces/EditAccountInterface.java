package com.mpbank.mpbank.domain.interfaces;

import com.mpbank.mpbank.dto.accounts.EditAccountDTO;

public interface EditAccountInterface {
  public void editBasicAccountInfo(EditAccountDTO<Object> editInfo);
}
