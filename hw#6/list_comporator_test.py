import list_comporator


def test_calculate_average():
    list_comp = list_comporator.ListComparator([1, 2, 3], [4, 5, 6])
    assert list_comp.calculate_average(list_comp.list1) == 2
    assert list_comp.calculate_average(list_comp.list2) == 5

    lc = list_comporator.ListComparator([], [])
    assert lc.calculate_average(lc.list1) == 0
    assert lc.calculate_average(lc.list2) == 0


def test_compare_lists():
    list_comp = list_comporator.ListComparator([1, 2, 3], [4, 5, 6])
    assert list_comp.compare_lists() == "Второй список имеет большее среднее значение"

    list_comp = list_comporator.ListComparator([], [])
    assert list_comp.compare_lists() == "Средние значения равны"

    list_comp = list_comporator.ListComparator([12, 3, 5], [])
    assert list_comp.compare_lists() == "Первый список имеет большее среднее значение"

    list_comp = list_comporator.ListComparator([], [12, 4, 2])
    assert list_comp.compare_lists() == "Второй список имеет большее среднее значение"
