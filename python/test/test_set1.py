import time

def test_text_after_sleep():
    time.sleep(1)
    assert 'test' == 'test'

def test_text_before_sleep():
    assert 'test' == 'test'
    time.sleep(1)

def test_failed_assertion():
    assert 'test1' == 'test2'
