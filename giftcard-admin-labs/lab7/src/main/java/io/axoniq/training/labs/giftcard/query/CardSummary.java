package io.axoniq.training.labs.giftcard.query;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Objects;

@Entity
public class CardSummary {

    @Id
    private String cardId;
    private Integer initialValue;
    private Instant issuedAt;
    private Integer remainingValue;
    private Integer numberOfTransactions;

    public CardSummary(String cardId, int initialValue, Instant issuedAt) {
        this.cardId = cardId;
        this.initialValue = initialValue;
        this.issuedAt = issuedAt;
        this.remainingValue = initialValue;
    }

    public CardSummary() {
    }

    public String getCardId() {
        return this.cardId;
    }

    public Integer getInitialValue() {
        return this.initialValue;
    }

    public Instant getIssuedAt() {
        return this.issuedAt;
    }

    public Integer getRemainingValue() {
        return this.remainingValue;
    }

    public Integer getNumberOfTransactions() {
        return this.numberOfTransactions;
    }

    public void setNumberOfTransactions(Integer numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public void setRemainingValue(int remainingValue) {
        this.remainingValue = remainingValue;
    }

    @Override
    public String toString() {
        return "CardSummary{" +
                "cardId='" + cardId + '\'' +
                ", initialValue=" + initialValue +
                ", issuedAt=" + issuedAt +
                ", remainingValue=" + remainingValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardSummary that = (CardSummary) o;
        return Objects.equals(cardId, that.cardId) &&
                Objects.equals(initialValue, that.initialValue) &&
                Objects.equals(issuedAt, that.issuedAt) &&
                Objects.equals(remainingValue, that.remainingValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, initialValue, issuedAt, remainingValue);
    }
}
