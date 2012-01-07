
final class Class_is {

   static int g;
   static Object[] f = sd.a(new Object[1], 120, (byte)120);
   static int h;
   static int c;
   static int a;
   static int d;
   static Object[] b = nea.a(new Object[1], 2, (byte)-117);
   static int[] e = new int[2];


   static final void b(byte var0, Object[] var1) {
      ++g;
      if(var0 <= 117) {
         f = (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var1[0]))[6]))[0]);
      }

      if(var1[0] == null) {
         var1[0] = new boolean[6];
      }

      if(null == var1[1]) {
         var1[1] = new int[5];
      }

   }

   static final void a(int var0, Object[] var1, byte var2) {
      if(var2 <= 4) {
         a(80, ((int[])((int[])f[4]))[1], (Object[])((Object[])f[12]), (Object[])((Object[])((Object[])((Object[])var1[2]))[15]));
      }

      ++d;
      ((int[])((int[])var1[1]))[0] = var0;
   }

   static final void a(byte var0, Object[] var1) {
      ++h;
      if(var0 == -92) {
         if(var1 != null) {
            bk.b(var1, (byte)-115);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(int var0, int var1, Object[] var2, Object[] var3) {
      try {
         ++c;
         if(!((boolean[])((boolean[])var2[63]))[11]) {
            throw new RuntimeException("");
         } else {
            ((int[])((int[])var2[1]))[35] = var1;
            if(var0 != -6991) {
               ((byte[])((byte[])var3[2]))[6] = 54;
            }

            var2[20] = var3;
            if(((boolean[])((boolean[])var2[63]))[18]) {
               Object[] var4 = ((Object[][])((Object[][])var2[32]))[3];
               if(var4 != null) {
                  tea.b(false, var4);
               }
            }

         }
      } catch (RuntimeException var5) {
         throw vt.a(var5, "is.B(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

}
