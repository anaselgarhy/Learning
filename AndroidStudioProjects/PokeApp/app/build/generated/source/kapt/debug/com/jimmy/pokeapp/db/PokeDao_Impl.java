package com.jimmy.pokeapp.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.jimmy.pokeapp.Pokemon;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PokeDao_Impl implements PokeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Pokemon> __insertionAdapterOfPokemon;

  private final EntityDeletionOrUpdateAdapter<Pokemon> __deletionAdapterOfPokemon;

  private final EntityDeletionOrUpdateAdapter<Pokemon> __updateAdapterOfPokemon;

  public PokeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPokemon = new EntityInsertionAdapter<Pokemon>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Pokemon` (`name`,`url`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pokemon value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
      }
    };
    this.__deletionAdapterOfPokemon = new EntityDeletionOrUpdateAdapter<Pokemon>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Pokemon` WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pokemon value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
      }
    };
    this.__updateAdapterOfPokemon = new EntityDeletionOrUpdateAdapter<Pokemon>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Pokemon` SET `name` = ?,`url` = ? WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pokemon value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
      }
    };
  }

  @Override
  public void addFavorites(final Pokemon poke) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPokemon.insert(poke);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteFavorites(final Pokemon poke) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPokemon.handle(poke);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateFavorites(final Pokemon poke) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPokemon.handle(poke);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Pokemon> getFavorites() {
    final String _sql = "SELECT * From Pokemon";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final List<Pokemon> _result = new ArrayList<Pokemon>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Pokemon _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        _item = new Pokemon(_tmpName,_tmpUrl);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
