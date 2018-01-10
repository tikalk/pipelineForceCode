import time

def test_number_after_sleep():
    time.sleep(1)
    assert 5 == 5

def test_number_before_sleep():
    assert 5 == 5
    time.sleep(1)

