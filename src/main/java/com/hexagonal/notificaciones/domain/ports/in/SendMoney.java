package com.hexagonal.notificaciones.domain.ports.in;

import com.hexagonal.notificaciones.domain.Account;
import lombok.EqualsAndHashCode;
import lombok.Value;
import jakarta.validation.constraints.NotNull;


public interface SendMoney {

    boolean sendMoney(SendMoneyCommand command);

    @Value
    @EqualsAndHashCode(callSuper = false)
    class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

        @NotNull
        private final Account.AccountId sourceAccountId;

        @NotNull
        private final Account.AccountId targetAccountId;

        @NotNull
        private final Money money;

        public SendMoneyCommand(Account.AccountId sourceAccountId, Account.AccountId targetAccountId, Money money) {
            this.sourceAccountId = sourceAccountId;
            this.targetAccountId = targetAccountId;
            this.money = money;
            this.validateSelf();
        }

    }
}
