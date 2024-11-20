package com.fatherofapps.androidbase.data.database.daos;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.fatherofapps.androidbase.data.database.entities.CustomerEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CustomerDao_Impl implements CustomerDao {
  private final RoomDatabase __db;

  public CustomerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public List<CustomerEntity> getAll() {
    final String _sql = "select * from customer";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<CustomerEntity> _result = new ArrayList<CustomerEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CustomerEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item = new CustomerEntity(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
