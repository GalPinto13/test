from add import add
import pytest

def test_add_positive_numbers():
    result = add(3, 4)
    assert result == 7

def test_add_negative_number():
    result = add(-3, -4)
    assert result == -7

def test_add_mixed_numbers():
    result = add(10, -3)
    assert result == 7