
final class epa {

   static int c;
   static int a;
   static int e;
   static int b;
   static int[] d;


   static final void a(Object[] var0, int var1) {
      ++b;
      synchronized(var0) {
         if(var0 != null && var0.length == 1) {
            sl.a = (Object[])((Object[])sl.a[9]);
         }

         Object[] var5 = mb.a(var0, 6);
         if(var5 == null) {
            return;
         }

         ((lm)(null == var5?null:var5[0])).a((byte)103);
         ((int[])((int[])var0[1]))[4] = 0;
         --((int[])((int[])var0[1]))[1];
         Object[] var6 = sl.a;
         tha var7 = (tha)(null != var5?var5[0]:null);
         long var8 = (long)(((Object[])((Object[])var5[1])).length << 0 | ((short[][])((short[][])var5[1]))[0].length);
         hj.a(var6, 0, var7, var8);
      }

      if(var1 > -100) {
         a(((byte[])((byte[])var0[0]))[11], (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var0[0]))[1]))[0]), (Object[])null);
      }

   }

   static final void a(int var0, Object[] var1) {
      ++c;
      int var2 = 73 % ((52 - var0) / 58);
      var1[2] = new tha();
      var1[0] = osa.a(0, new Object[2]);
   }

   static final lb b(int var0, Object[] var1) {
      if(var0 != 19153) {
         return (lb)null;
      } else {
         ++a;
         return new lb(var1);
      }
   }

   static final void a(byte var0, Object[] var1, Object[] var2) {
      try {
         ++e;
         if(var1 != null && var1.length == 7) {
            uaa.a(var1, var2, 4);
         } else {
            int var3;
            if(var1 != null && 15 == var1.length) {
               var3 = ((int[])((int[])var1[1]))[0];
               --((int[])((int[])var2[1]))[2];
               if(((int[])((int[])var2[1]))[2] != 0) {
                  if(var2[12] != null) {
                     qo.a((long[])((long[])var2[12]), var3 + 1, (long[])((long[])var2[12]), var3, -var3 + ((int[])((int[])var2[1]))[2]);
                  }

                  if(null != var2[3]) {
                     qo.a((Object[])((Object[])var2[3]), 1 + var3, (Object[])((Object[])var2[3]), var3, ((int[])((int[])var2[1]))[2] - var3);
                  }
               } else {
                  var2[12] = null;
                  var2[3] = null;
               }

            } else if(null != var1 && 13 == var1.length) {
               bb.a(0, ((long[])((long[])var1[5]))[0], (byte)56, var2, (String)var1[2]);
            } else if(var1 != null && var1.length == 10) {
               lk.a(((byte[])((byte[])var1[6]))[0], var2, ((int[])((int[])var1[1]))[0], var0 ^ -30);
            } else if(null != var1 && -7 == ~var1.length) {
               li.a(var2, (byte)-82, var1);
            } else if(var1 != null && 8 == var1.length) {
               long var13 = ((long[])((long[])var1[5]))[0];
               String var5 = (String)var1[7];
               if(null != var5 && -1 == ~var5.length()) {
                  var5 = null;
               }

               if(var13 > 0L == ((boolean[])((boolean[])var2[8]))[0]) {
                  if(((boolean[])((boolean[])var2[8]))[1] != (null != var5)) {
                     throw new RuntimeException("");
                  } else {
                     if(var13 > 0L && (null == var2[12] || ((int[])((int[])var2[1]))[2] >= ((long[])((long[])var2[12])).length) || null != var5 && (var2[3] == null || ((Object[])((Object[])var2[3])).length <= ((int[])((int[])var2[1]))[2])) {
                        it.a(var2, 17577, ((int[])((int[])var2[1]))[2] + 5);
                     }

                     if(var2[12] != null) {
                        ((long[])((long[])var2[12]))[((int[])((int[])var2[1]))[2]] = var13;
                     }

                     if(null != var2[3]) {
                        ((String[])((String[])var2[3]))[((int[])((int[])var2[1]))[2]] = var5;
                     }

                     ++((int[])((int[])var2[1]))[2];
                  }
               } else {
                  throw new RuntimeException("");
               }
            } else if(var1 != null && var1.length == 4) {
               ((byte[])((byte[])var2[4]))[1] = ((byte[])((byte[])var1[1]))[1];
               ((byte[])((byte[])var2[4]))[3] = ((byte[])((byte[])var1[1]))[3];
               ((byte[])((byte[])var2[4]))[2] = ((byte[])((byte[])var1[1]))[0];
               ((byte[])((byte[])var2[4]))[0] = ((byte[])((byte[])var1[1]))[2];
               ((boolean[])((boolean[])var2[8]))[2] = ((boolean[])((boolean[])var1[3]))[0];
            } else if(null != var1 && 3 == var1.length) {
               uv.a(true, var1, var2);
            } else if(null != var1 && -12 == ~var1.length) {
               var2[5] = var1[5];
            } else if(var1 != null && -13 == ~var1.length) {
               pba.a(-1, var2, var1);
            } else if(null != var1 && var1.length == 9) {
               var3 = ((int[])((int[])var1[1]))[1];
               int var4 = ((int[])((int[])var1[1]))[0];
               if(null != var2[9]) {
                  lm var9 = pm.a((long)var3, (Object[])((Object[])var2[9]), false);
                  if(var9 != null) {
                     ma var6;
                     if(var9 instanceof ma && ((var6 = (ma)var9) == null?null:var6.s) != null) {
                        ma var7;
                        Object[] var11 = null == (var7 = (ma)var9)?null:var7.s;
                        if(((int[])((int[])var11[1]))[0] != var4) {
                           ((int[])((int[])var11[1]))[0] = var4;
                        }

                        return;
                     }

                     var9.a((byte)49);
                  }
               } else {
                  var2[9] = nb.a((byte)104, 4, new Object[5]);
               }

               Object[] var8;
               di.a((Object[])((Object[])var2[9]), true, (lm)(null == (var8 = ps.a((byte)122, var4, new Object[2]))?null:var8[0]), (long)var3);
            } else if(null != var1 && -15 == ~var1.length) {
               rs.a(var0 + 24984, var2, var1);
            } else {
               if(var0 != -26) {
                  d = (int[])((int[])var1[9]);
               }

               if(var1 != null && var1.length == 5) {
                  rf.a((byte)114, var2, var1);
               } else {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var12) {
         throw vt.a(var12, "epa.A(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

}
